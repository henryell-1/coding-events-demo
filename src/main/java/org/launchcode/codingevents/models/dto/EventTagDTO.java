package org.launchcode.codingevents.models.dto;


import org.launchcode.codingevents.models.Event;

import org.springframework.core.metrics.StartupStep;


import javax.swing.text.html.HTML;
import javax.validation.constraints.NotNull;

public class EventTagDTO {

    @NotNull
    private Event event;

    @NotNull
    private StartupStep.Tag tag;

    public EventTagDTO(){}

    public StartupStep.Tag getTag() {
        return tag;
    }

    public void setTag(StartupStep.Tag tag) {
        this.tag = tag;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
