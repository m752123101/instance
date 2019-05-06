//package com.experiment.instance.config;
//
//import com.experiment.instance.batchContent.UserIprocessor;
//import com.experiment.instance.domain.User;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.launch.support.RunIdIncrementer;
//import org.springframework.batch.item.ItemProcessor;
//import org.springframework.batch.item.ItemReader;
//import org.springframework.batch.item.ItemWriter;
//import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
//import org.springframework.batch.item.database.JdbcBatchItemWriter;
//import org.springframework.batch.item.file.FlatFileItemReader;
//import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
//import org.springframework.batch.item.file.mapping.DefaultLineMapper;
//import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.sql.DataSource;
//
///**
// * @author hanwen.dong
// * @date 2019/4/13 09:16
// * @Description auto
// */
//
//@Configuration
//@EnableBatchProcessing
//public class SpringBatchConfig {
//    @Bean
//    public ItemReader<User> reader() {
//
//        FlatFileItemReader<User> reader = new FlatFileItemReader<User>();
//        reader.setResource(new ClassPathResource("test.text"));
//        reader.setLineMapper(new DefaultLineMapper<User>() {{
//            setLineTokenizer(new DelimitedLineTokenizer() {{
//                setNames(new String[]{"userName", "address", "birth", "gender"});
//            }});
//            setFieldSetMapper(new BeanWrapperFieldSetMapper<User>() {{
//                setTargetType(User.class);
//            }});
//        }});
//        return reader;
//    }
//
//    @Bean
//    public ItemProcessor<User, User> processor() {
//        return new UserIprocessor();
//    }
//    @Bean
//    public ItemWriter<User> writer(DataSource dataSource){
//        JdbcBatchItemWriter<User> writer=new JdbcBatchItemWriter<>();
//        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<User>());
//            writer.setSql("intert into User (user_name ,address,birth,gender) values (:userName, :address, :birth,:gender)");
//        writer.setDataSource(dataSource);
//        return writer;
//    }
//
//    @Bean
//    public Job CSV2DBJob(JobBuilderFactory jobs, Step step) {
//        return jobs.get("CSV2DBJob")
//                .incrementer(new RunIdIncrementer())
//                .flow(step)
//                .end()
//                .build();
//    }
//    @Bean
//    public Step step1(StepBuilderFactory stepBuilderFactory,ItemReader<User> reader,ItemWriter<User> writer,ItemProcessor<User,User> processor){
//        return stepBuilderFactory.get("step1")
//                .<User,User>chunk(10)
//                .reader(reader)
//                .processor(processor)
//                .writer(writer)
//                .build();
//    }
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource){
//        return  new JdbcTemplate(dataSource);
//    }
//}
