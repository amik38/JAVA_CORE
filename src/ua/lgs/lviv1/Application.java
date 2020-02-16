package ua.lgs.lviv1;

public class Application {public static void main(String[] args) {
	HourlySalaryWorker h = new HourlySalaryWorker(168, 3.00);
	FixedSalaryWorker f = new FixedSalaryWorker(1000.00);
	
	h.salary();
	f.salary();
}
}

