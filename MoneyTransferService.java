package Basics;

public class MoneyTransferService {

	CurrencyConverter C = new CurrencyConverter();

	double computetransferamount(int countryindex, double amount) {

		return C.ComputeTransferAmount(countryindex, amount);

	}

	double computetransferfee(int countryIndex, double Amount) {

		return 0.02 * computetransferamount(countryIndex, Amount);

	}

	public static void main(String[] args) {

		MoneyTransferService M = new MoneyTransferService();

		double L = M.computetransferamount(0, 1000.0d);

		System.out.println("\n" + "Transfer Amount:" + L + "\n");

		double K = M.computetransferfee(0, 1000.0d);

		System.out.println("Transfer Fee:" + K + "\n");

	}

}