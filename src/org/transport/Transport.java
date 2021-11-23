package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	private void TransportForm() {
		// TODO Auto-generated method stub
System.out.println("Transport Form:");
	}
	public static void main(String[] args) {
		Transport t=new Transport();
		Road r=new Road();
		Air a=new Air();
		Water w=new Water();
		t.TransportForm();
		r.bike();
		r.bus();
		r.car();
		r.cycle();
		a.aeroPlane();
		a.heliCopter();
		w.boat();
		w.ship();
	}
}
