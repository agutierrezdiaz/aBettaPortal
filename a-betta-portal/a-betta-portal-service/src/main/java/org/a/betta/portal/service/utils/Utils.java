package org.a.betta.portal.service.utils;

import java.util.Calendar;
import java.util.Date;

public class Utils {

	/**
	 * Method that creates a Date object from int params
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public static Date createDate(int year, int month, int day) {
		return createDate(year, month, day, 0);
	}
	
	/**
	 * Method that creates a Date object from int params
	 * @param year
	 * @param month
	 * @param day
	 * @param hour
	 * @return
	 */
	public static Date createDate(int year, int month, int day, int hour) {
		return createDate(year, month, day, hour, 0);
	}
	
	/**
	 * Method that creates a Date object from int params
	 * @param year
	 * @param month
	 * @param day
	 * @param hour
	 * @param minute
	 * @return
	 */
	public static Date createDate(int year, int month, int day, int hour, int minute) {
		return createDate(year, month, day, hour, minute, 0);
	}
	
	/**
	 * Method that creates a Date object from int params
	 * @param year
	 * @param month
	 * @param day
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Date createDate(int year, int month, int day, int hour, int minute, int second) {
		Calendar auxDate = Calendar.getInstance();
		auxDate.set(year, month, day, hour, minute, second);
		return auxDate.getTime();
	}
	
}
