package ch7;
 

interface Hungry<E>{void munch();}
interface Carnivore<E extends Animal>extends Hungry<E>{}
interface Herbivore<E extends Animal> extends Hungry<E> {}
abstract class Animal{}
abstract class Plant{}

class Grass extends Plant {}
class Sheep extends Animal implements Herbivore<Sheep>{public void munch(Sheep x) {}

@Override
public void munch() {
	// TODO Auto-generated method stub
	
}}
class Wolf extends Animal implements Carnivore<Sheep>{public void munch(Sheep x) {}

@Override
public void munch() {
	// TODO Auto-generated method stub
	
}}
public class Generics_Program6 {

}
