### Spring Cloud Function for AWS Lambda Triggers on S3 Upload

- S3 Upload Triggers AWS Lambda using Spring Cloud function Java 21 and AWS SDK 2.x.

### How Spring Cloud function is different from Spring Boot?

- Spring cloud function is used to span the JVM as quickly as possible, and removes unnecessary bootstrapping steps during initialization

### How to run in AWS Lambda

- Handler must be set to : org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest
- (This will only work for Java 17 and above, for Java 8, there is a slight variation in its implementation)

![image](https://github.com/user-attachments/assets/8adcc594-d929-4c40-a80d-be66a124a795)

- I belive this is part of Spring Routing function.
![image](https://github.com/user-attachments/assets/9b27f911-6646-4a7a-a483-f5e84f600d79)


## Reference on Spring Cloud functions

- [Spring Cloud Function official Doc](https://docs.spring.io/spring-cloud-function/reference/adapters/aws-intro.html)
- [Spring cloud function on Java 17](https://youtu.be/bxK4GscuVgs)
- [AWS Lambda Spring Cloud Functions](https://www.danvega.dev/blog/aws-lambda-snapstart-spring)
- [What is AWS Lambda Snapshot](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
- [Spring Cloud Functions Tutorial for enhancing function implementation and testing](https://www.youtube.com/watch?v=dotPoJXXdQc)
- [Function as endpoints](https://www.youtube.com/watch?v=2SjVqTapQAs)

## Getting Started

Follow the below instructions to get started with the source code:
- [Make sure you have all Requirements](#requirements)
- [Make sure to add AWS SDK for Java 2.x ](#Dependencies)

## Requirements

- [AWS Account](https://aws.amazon.com/console/)
- [IAM user with access-key and secret-access-key (user’s credentials)](https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-managing-access-for-an-iam-user)
- [Download mock test file from](https://www.mockaroo.com/)


## Reference

- [Why Spring Boot is not Recommended for Lambda](https://www.reddit.com/r/java/comments/y4kuvr/is_anyone_using_java_spring_boot_in_aws_lambda/)
- [Amazon S3 Bucket Example](https://docs.aws.amazon.com/code-library/latest/ug/java_2_s3_code_examples.html)
- [Maven Setup](https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/setup-project-maven.html)
- [AWS Lambda Examples](https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/java_lambda_code_examples.html)
- [AWS Lambda Example YT 1](https://www.youtube.com/watch?v=3oV4Nj_ruOA)
- [AWS Lambda Example YT 2](https://www.youtube.com/watch?v=wk8Lk8R7Pck&t=3s)


## Dependencies

- Spring Cloud functions


```xml

<!- to expose the functions as web endpoint-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-function-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-function-adapter-aws</artifactId>
</dependency>


<dependencyManagement>
<dependencies>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-dependencies</artifactId>
        <version>${spring-cloud.version}</version>
        <type>pom</type>
        <scope>import</scope>
    </dependency>
</dependencies>
</dependencyManagement>
```


- AWS Java SDK Amazon S3:

```xml
<dependencies>
<!-- S3 AWS SDK for Java 2.x -->
<dependency>
    <groupId>software.amazon.awssdk</groupId>
    <artifactId>s3</artifactId>
</dependency>

<!-- Lambda Core, AWS SDK, this is still available only in Java 1.x  -->
<dependency>
    <groupId>com.amazonaws</groupId>
    <artifactId>aws-lambda-java-core</artifactId>
    <version>1.2.3</version>
</dependency>

<!-- Lambda events, AWS SDK, this is still available only in Java 1.x  -->
<dependency>
    <groupId>com.amazonaws</groupId>
    <artifactId>aws-lambda-java-events</artifactId>
    <version>3.13.0</version>
</dependency>

</dependencies>

<dependencyManagement>
<dependencies>
    <dependency>
        <groupId>software.amazon.awssdk</groupId>
        <artifactId>bom</artifactId>
        <version>${aws.version}</version>
        <type>pom</type>
        <scope>import</scope>
    </dependency>
</dependencies>
</dependencyManagement>
```


Add on

![image](https://github.com/user-attachments/assets/911cb94a-7fb3-49af-9494-f360e8e6eb18)



Reference ->> https://www.youtube.com/watch?v=YkkFLcpUKNI



### Lambda In general 

![image](https://github.com/user-attachments/assets/65926f0e-82fd-48ba-ae24-62671bbc5f0b)

