package InterfacePack.Functionality;

import InterfacePack.EventHelper.EventHandler;
import InterfacePack.Events.Event;

public class ControllerTasks
{
    private Event event;

    public ControllerTasks(Event event)
    {
        this.event = event;
    }

    public void control(Event.Type type, EventHandler handler)
    {
        if(event.handled)
            return;

        if(event.getType() == type)
            handler.handle(event);
    }

}