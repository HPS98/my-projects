package Basics;

public class CurrencyConverter {

	double[] ExchangeRates = new double[] { 63.0d };          // double[] ExchangeRates; (Real Statement for This Class)
														     // But MoneyTransferService Class is Using This Class So Write
														    // here (=new double[]{63.0d})

	void SetExchangeRates(double[] Rates) {

		ExchangeRates = Rates;

	}

	void UpdateExchangeRate(int ArrayIndex, double NewValue) {

		ExchangeRates[ArrayIndex] = NewValue;

	}

	double GetExchangeRate(int ArrayIndex) {

		return ExchangeRates[ArrayIndex];

	}

	double ComputeTransferAmount(int ArrayIndex, double Amount) {

		return Amount * GetExchangeRate(ArrayIndex);

	}

	void PrintCurrencies() {

		System.out.println("\nrupee:" + ExchangeRates[0]);
		System.out.println("\ndirham:" + ExchangeRates[1]);
		System.out.println("\nreal:" + ExchangeRates[2]);
		System.out.println("\nchilean_peso:" + ExchangeRates[3]);
		System.out.println("\nmexican_peso:" + ExchangeRates[4]);
		System.out.println("\n_yen:" + ExchangeRates[5]);
		System.out.println("\n$australian:" + ExchangeRates[6] + "\n");
		System.out.println("Array Length:" + ExchangeRates.length + "\n\n");

	}

	public static void main(String[] args) {

		CurrencyConverter CC = new CurrencyConverter();

		double[] Rates = new double[] { 63.0d, 3.0d, 4.0d, 595.5d, 18.0d, 107.0d, 2.0d };

		CC.SetExchangeRates(Rates);

		CC.PrintCurrencies();

		Rates = new double[] { 65.0d, 3.5d, 4.2d, 600.5d, 18.9d, 108.0d, 2.6d };

		CC.SetExchangeRates(Rates);

		CC.PrintCurrencies();

		CC.UpdateExchangeRate(0, 66.0);

		CC.PrintCurrencies();

		double Rate = CC.GetExchangeRate(0);

		System.out.println("Rate:" + Rate + "\n\n");

		double Amount = CC.ComputeTransferAmount(0, 1000);

		System.out.println("Amount:" + Amount + "\n");

	}

}