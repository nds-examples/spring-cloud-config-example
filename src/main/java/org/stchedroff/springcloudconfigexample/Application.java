package org.stchedroff.springcloudconfigexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import java.util.Arrays;

@EnableConfigServer
@SpringBootApplication
public class Application implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("Application started with command-line arguments: {}", Arrays.toString(args.getSourceArgs()));
        logger.info("NonOptionArgs: {}", args.getNonOptionArgs());
        logger.info("OptionNames: {}", args.getOptionNames());

        for (String name : args.getOptionNames()){
            logger.info("arg-" + name + "=" + args.getOptionValues(name));
        }

        boolean containsOption = args.containsOption("person.name");
        logger.info("Contains person.name: " + containsOption);
    }
}