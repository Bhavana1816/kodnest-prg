package com;

class Enterprenure {
	int ownerShipid;
	String OrganisationName;
	int sizeoforganisation;

	void Acquire() {
		System.out.println("Acquire other organisation");
	}

	void RaisedFund() {
		System.out.println("Hurryyyyy-----we got it");
	}

	Enterprenure(int ownerShipid, String OrganisationName, int sizeoforganisation) {
		this.ownerShipid = ownerShipid;
		this.OrganisationName = OrganisationName;
		this.sizeoforganisation = sizeoforganisation;
	}

	Enterprenure(int a, String b) {
		ownerShipid = a;
		OrganisationName = b;
	}

}