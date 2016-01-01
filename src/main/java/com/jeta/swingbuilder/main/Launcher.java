/*
 * Copyright (C) 2005 Jeff Tassin
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.jeta.swingbuilder.main;

/**
 * This is the main entry point for the Abeille Forms application.
 * 
 * @author Jeff Tassin
 */
public class Launcher {
	/**
	 * Main entry routine.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Fix Mac slow rendering
		 */
		System.setProperty("swing.volatileImageBufferEnabled", "false" );
		AbeilleForms fi = new AbeilleForms();
		fi.launch(args);
	}
}
