package net.management.wheels.service;

import java.util.List;

import net.management.wheels.form.Contact;

public interface ContactService {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
