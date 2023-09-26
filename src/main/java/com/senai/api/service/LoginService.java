package com.senai.api.service;

public interface LoginService {

	String formatLogin(String login);

	Boolean isCpf(String CPF);

	Boolean validCpf(String CPF);
}
