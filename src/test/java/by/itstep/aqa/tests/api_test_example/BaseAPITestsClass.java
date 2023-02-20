package by.itstep.aqa.tests.api_test_example;
import org.junit.jupiter.api.BeforeEach;

import java.net.http.HttpClient;

public class BaseAPITestsClass implements HttpRequestBuilder, HttpRequestExecutor{

    @Override
    public HttpClient httpClientInitialization(){
       return HttpClient.newHttpClient();
    }
}
