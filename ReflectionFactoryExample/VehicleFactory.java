/*
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
 */

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;

public class VehicleFactory {
	private HashMap<String, String> registrations;

	public VehicleFactory(String packageName) {
		try {
			String[] classNames;
			this.registrations = new HashMap<String, String>();
			classNames = this.getClasses(packageName);
			this.registerClasses(classNames);
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
	
	/*
	 * returns names of all registered vehicles
	 */
	public Collection<String> getVehicleNames() {
		return registrations.keySet();
	}

	private String[] getClasses(String packageName) {
		try {
			ClassLoader classLoader;
			ArrayList<String> retVal;
			ArrayList<File> classFiles;
			Enumeration<URL> resources;
			retVal = new ArrayList<String>();
			classFiles = new ArrayList<File>();
			
			// getting class loader for classes located relative to this class
			classLoader = this.getClass().getClassLoader();
			// initializing class loader with the directory where the package is located
			resources = classLoader.getResources(packageName);
			
			while (resources.hasMoreElements()) {
				// The directory where the .class files for the package are located:
				File parent = new File(resources.nextElement().getFile());				
				if (parent.exists()) { 
					if (parent.canRead()) { // checking "read" permissions
						if (parent.isDirectory()) { 
							// getting all files in the directory:
							for (File child : parent.listFiles()) {
								if (child.exists()) {
									if (child.canRead()) {
										if (child.isFile()) {
											// adding all class files...
											if (child.getName().endsWith(".class")) 
												// ....except ones with names starting with Vehicle
												if (!child.getName().startsWith("Vehicle")){
												classFiles.add(child);
											}
										}
									}
								}
							}
						} else if (parent.isFile()) { // for potential nested classes, etc. 
							if (parent.getName().endsWith(".class")) {
								classFiles.add(parent);
							}
						}
					}
				}
			}
			for (File classFile : classFiles) {
				// getting the name without ".class":
				retVal.add(classFile.getName().substring(0, classFile.getName().length() - 6));
			}
			return (String[]) retVal.toArray(new String[retVal.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Vehicle getVehicle(String name) {
		try {
			// load the class corresponding to the name
			return (Vehicle) Class.forName(this.registrations.get(name)).getConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private void registerClasses(String[] classNames) {
		try {
			// Register vehicle classes for the factory method
			for (String className : classNames) {
				Vehicle vehicle = (Vehicle) Class.forName(className).getConstructor().newInstance();
				this.registrations.put(vehicle.getName(), className);
			}
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
}
