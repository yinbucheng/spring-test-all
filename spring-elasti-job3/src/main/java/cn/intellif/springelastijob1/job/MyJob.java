package cn.intellif.springelastijob1.job;

import cn.intellif.springelastijob1.utils.BeanUtils;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;


public class MyJob implements SimpleJob{


    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("myjob3  ..........."+ BeanUtils.getCurrentTime());
    }

}
