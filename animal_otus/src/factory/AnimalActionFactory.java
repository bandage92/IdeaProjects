package factory;

import animals.AbsAnimal;
import animals.birds.IFlying;

public class AnimalActionFactory {

    public void specialAnimalActions(AbsAnimal animal) {
        if(animal instanceof IFlying) {
            IFlying flyingAnimal = (IFlying) animal;
            flyingAnimal.fly();
        }
    }
}