package minh.data.Statistic;


import minh.data.Statistic.Repository.SynRepository;
import minh.data.Statistic.Model.Syn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Optional;

@SpringBootApplication
public class StatisticApplication {

	@Autowired
	SynRepository synRepository;


	public static void main(String[] args) {
		SpringApplication.run(StatisticApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	void testDatabase(){
//		Syn syn= synRepository.findById("gold").get();
//		System.out.println(syn.getValue());

	}

}
