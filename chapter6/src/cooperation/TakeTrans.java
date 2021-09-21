package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames=new Student("James", 5000);
		Student studentTomas=new Student("Tomas", 10000);
		Student studentEdward=new Student("Edward", 20000);
		
		Bus bus100=new Bus(100);		//노선 번호가 100인 버스
		studentJames.takeBus(bus100);	//james가 버스를 탐
		studentJames.showInfo();		//james 정보 출력
		bus100.showInfo();				//버스100의 정보 출력
		
		Subway subwayGreen=new Subway("2호선");	//노선 번호가 2호선인 지하철
		studentTomas.takeSubway(subwayGreen);	//Tomas탑승
		studentTomas.showInfo();				//Tomas의 정보
		subwayGreen.showInfo();					//지하철 정보 출력
		
		Taxi taxiYellow=new Taxi("노랑");	//색이 노란색인 택시
		studentEdward.takeTaxi(taxiYellow);	//Edward 탑승
		studentEdward.showInfo();			//Edward의 정보
		taxiYellow.showInfo();				//택시의 정보
	}
}
