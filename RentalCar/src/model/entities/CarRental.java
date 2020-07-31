package model.entities;

import java.util.Date;

public class CarRental {
	private Date star;
	private Date finish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {
	}

	public CarRental(Date star, Date finish, Vehicle vehicle) {
		this.star = star;
		this.finish = finish;
		this.vehicle = vehicle;
		
	}

	public Date getStar() {
		return star;
	}

	public void setStar(Date star) {
		this.star = star;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
}
