module OnlineEyeClinic {
	exports com.cg.onlineeyeclinic.repository;
	exports com.cg.onlineeyeclinic.controller;
	exports com.cg.onlineeyeclinic.service;
	exports com.cg.onlineeyeclinic.exception;
	exports com.cg.onlineeyeclinic;
	exports com.cg.onlineeyeclinic.model;

	requires guava;
	requires java.persistence;
	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.data.commons;
	requires spring.data.jpa;
	requires spring.plugin.core;
	requires spring.web;
	requires springfox.core;
	requires springfox.spi;
	requires springfox.spring.web;
	requires springfox.swagger2;
}