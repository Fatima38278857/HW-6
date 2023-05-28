package Proekt;

import javax.annotation.PostConstruct;

public abstract class Transport {
    @PostConstruct
    public void readyForWork(){
        System.out.println(this.getClass().getSimpleName() + " " + "готов к работе");
    }
}
