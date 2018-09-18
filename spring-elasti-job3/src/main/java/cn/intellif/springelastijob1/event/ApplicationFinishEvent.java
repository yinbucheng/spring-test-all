package cn.intellif.springelastijob1.event;

import org.springframework.context.ApplicationEvent;

public class ApplicationFinishEvent extends ApplicationEvent {
    public ApplicationFinishEvent(Object source) {
        super(source);
    }
}
