/*
 * The project is heavily based on:
 * https://github.com/MannyPeterson/ReflectionFactory (see copyright)
 * 
 * Java Reflection Factory Example
 * Copyright (C) 2019 Manny Peterson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>
 * 
 * Modified by Elena Machkasova for UMN Morris CSci 3301
 * 
 */

public class VehicleExample {
	public static void main(String[] args) {
		/* 
		 * Create a new instance of the reflection factory by 
		 * passing the package name to the constructor. The class
		 * scanner will look in this package for classes. All of the
		 * classes in this package must share the same superclass -
		 * Vehicle in this case.
		 */
		// Elena's comment: this was originally going to a package
		// where the vehicles are defined, 
		// but running it on Windows hit file permission issues,
		// so I moved all the java files to the default package. 
		VehicleFactory vehicleFactory = new VehicleFactory(".");
		System.out.println("Today we have:" + vehicleFactory.getVehicleNames());
		

		/* 
		 * Call the getVehicle() method with the identifier ("name")
		 * of the class to create a new instance of.
		 */
		Vehicle vehicleOne = vehicleFactory.getVehicle("boat");
		Vehicle vehicleTwo = vehicleFactory.getVehicle("train");
		Vehicle vehicleThree = vehicleFactory.getVehicle("truck");
		Vehicle vehicleFour = vehicleFactory.getVehicle("airplane");
		Vehicle vehicleFive = vehicleFactory.getVehicle("car");
		
		/* 
		 * Call each of the new classes with the println() method
		 * to invoke the toString() method and verify the output
		 * is correct.
		 */
		System.out.println(vehicleOne);
		System.out.println(vehicleTwo);
		System.out.println(vehicleThree);
		System.out.println(vehicleFour);
		System.out.println(vehicleFive);
		
		return;
	}
}