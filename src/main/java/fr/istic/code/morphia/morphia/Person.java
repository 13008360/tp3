package fr.istic.code.morphia.morphia;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity("persons")
public class Person {

	@Id private ObjectId id;

	private String name;
	@Embedded
	private Address address;

	public Person() {
		super();
	}

	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}





}