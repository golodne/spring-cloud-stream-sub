package ru.learn.springcloudstreamsub;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
@Slf4j
public class SpringCloudStreamSubApplication {

	@StreamListener("input")
	public void counsumeMessage(Book book) {
		log.info("recive book: {}",book);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamSubApplication.class, args);
	}

}
