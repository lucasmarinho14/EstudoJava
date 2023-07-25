package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:26");
		Instant d06 = Instant.parse("2023-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2023-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("18/07/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("18/07/2023 01:30", fmt2);
		
		
		System.out.println(d01.toString());
		System.out.println(d02.toString());
		System.out.println(d03.toString());
		System.out.println(d04.toString());
		System.out.println(d05.toString());
		System.out.println(d06.toString());
		System.out.println(d07.toString());
		System.out.println(d08.toString());
		System.out.println(d09.toString());
		
		System.out.println("---------------------------------");
		//Conversão para texto + formatação
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04)); 
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("---------------------------------");
		//Conversão e formatação para texto: data + hora
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		
		System.out.println("---------------------------------");
		//Formatação do metodo instant
		System.out.println("d06 = " + fmt3.format(d06));
		
		
				
	}
}
