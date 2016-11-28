package chapter5.interfaces;

public class Interface {
	/*
	 * - Interfaces cannot be instantiated directly
	 * - An interface is not required to have any methods
	 * - An interface may not be marked as final
	 * - All top-level interfaces are assumed to have public or default 
	 *   access, and they must include abstract modifier in their definition
	 *   Therefore, marking an interface as private, protected or final will
	 *   trigger a compiler error, since this is incompatible with these assumptions
	 * - All nondefault methods in an interface are assumed to have the modifiers
	 *   abstract and public in their definition. Therefore, marking a method as 
	 *   private, protected or final will trigger compiler error as these are
	 *   incompatible with the abstract and public keywords
	 */
}


