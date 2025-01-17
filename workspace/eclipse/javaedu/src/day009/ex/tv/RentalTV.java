package day009.ex.tv;

public class RentalTV extends TV implements Rentable {
	int price;

	public RentalTV() {

	}

	public RentalTV(String model, int size, int channel,int price) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.printf("대여 TV채널 %d번의 프로를 플레이합니다.", getChannel());
	}

	public void rent() {
		System.out.printf("%s 모델의 상품을 대여합니다. %,d원을 지불해주세요.", getModel(), price);
	}

	public String toString() {
		return String.format("대여상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(),price, getSize());
	}
}
