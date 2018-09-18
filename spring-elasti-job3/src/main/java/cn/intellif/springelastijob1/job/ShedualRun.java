package cn.intellif.springelastijob1.job;

import cn.intellif.springelastijob1.event.ApplicationFinishEvent;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ShedualRun implements ApplicationListener {
    @Autowired
    private ZookeeperRegistryCenter zookeeperRegistryCenter;

    private void initJob() {
        int shardingTotalCount = 1;
        JobCoreConfiguration jobCoreConfiguration = JobCoreConfiguration.newBuilder("JobDemo1", "0/60 * * * * ?", shardingTotalCount).build();
        SimpleJobConfiguration simpleJobConfiguration = new SimpleJobConfiguration(jobCoreConfiguration, MyJob.class.getCanonicalName());
        JobScheduler jobScheduler = new JobScheduler(zookeeperRegistryCenter, LiteJobConfiguration.newBuilder(simpleJobConfiguration).build());
        try {
            jobScheduler.init();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("定时任务创建失败");
        }
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof ApplicationFinishEvent){
            initJob();
        }
    }
}
