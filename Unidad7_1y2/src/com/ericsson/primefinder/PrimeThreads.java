package com.ericsson.primefinder;

public class PrimeThreads {
	public static void main(String[] arguments) {
		arguments=new String[2];
		arguments[0]="52";
		arguments[1]="-1";
		PrimeThreads pt = new PrimeThreads(arguments);
		
	}
	
	public PrimeThreads(String[] arguments)  {
		PrimeFinder[] finder = new PrimeFinder[arguments.length];
		for (int i = 0; i < arguments.length; i++) {
			try {
				long count = Long.parseLong(arguments[i]);
				try{
					finder[i] = new PrimeFinder(count);
				}catch (NegativeNumberException e){
					e.printStackTrace();
				}
				System.out.println("Looking for prime " + count);
			} catch (NumberFormatException nfe) {
				System.out.println("Error: " + nfe.getMessage());
			}
		}
		boolean complete = false;
		while (!complete) {
			complete = true;
			for (int j = 0; j < finder.length; j++) {
				if (finder[j] == null) continue;
					if (!finder[j].finished) {
						complete = false;
					} else {
						displayResult(finder[j]);
						finder[j] = null;
					}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			// do nothing
			}
		}
		}
		private void displayResult(PrimeFinder finder) {
		System.out.println("Prime " + finder.target + " is " + finder.prime);
	}
}
