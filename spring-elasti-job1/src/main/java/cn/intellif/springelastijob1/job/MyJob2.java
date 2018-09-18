package cn.intellif.springelastijob1.job;

import cn.intellif.springelastijob1.utils.BeanUtils;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MyJob2 implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("MyJob2 "+Thread.currentThread().getName()+">>>>>>>>>>>>>time  "+ BeanUtils.getCurrentTime());
    }
}