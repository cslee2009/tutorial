package lesson.designpattern.factory;

import java.util.function.Supplier;

/*
 * Functional interface that allows adding builder with name to the factory
 */
public interface Builder {
	void add(WeaponType name, Supplier<Weapon> supplier);
}
