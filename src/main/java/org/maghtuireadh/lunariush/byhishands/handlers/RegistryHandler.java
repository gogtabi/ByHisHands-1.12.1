package org.maghtuireadh.lunariush.byhishands.handlers;

import org.maghtuireadh.lunariush.byhishands.init.BlockInit;
import org.maghtuireadh.lunariush.byhishands.init.ItemInit;

public class RegistryHandler {
	public static void Client(){
	}
	
	public static void Common() {
		ItemInit.init();
		BlockInit.init();
		ItemInit.register();
		BlockInit.register();
	}
}
