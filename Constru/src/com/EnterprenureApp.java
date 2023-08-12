package com;

class EnterprenureApp {
	public static void main(String[] args) {
		Enterprenure e1 = new Enterprenure(345, "ABC",666);
		System.out.println("ID = "+e1.ownerShipid+", Name = "+e1.OrganisationName+", Size = "+e1.sizeoforganisation);
		e1.Acquire();
		e1.RaisedFund();
	}
}