class Program {

	private static double bannerPrice(Banner b, int copies) {
		double rate = copies > 20 ? 0.80 : 0.75;
		return (b.area() * rate * copies);
	}

	public static void main(String[] args) {
		double w = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		Banner mybanner = new Banner(w, h);
		System.out.printf("my Banner price without border : %.2f%n", bannerPrice(mybanner, n));
		Banner yourbanner = new Banner(w, h);
		yourbanner.borderStyle(true);
		System.out.printf("Your banner price with thin border %.2f%n", bannerPrice(yourbanner, n));
		yourbanner.borderStyle(BorderStyle.THICK);
		System.out.printf("Your banner price with thick border %.2f%n", bannerPrice(yourbanner, n));

	}
}

