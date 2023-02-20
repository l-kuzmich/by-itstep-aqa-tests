package by.itstep.aqa.tests.api_test_example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APITest extends BaseAPITestsClass{

    @Test
    public void verifySuccessStatusCode(){

        HttpRequest request = getRequest(
                "https://www.postman-echo.com/get",
                HttpMethod.GET,
                HttpRequest.BodyPublishers.noBody()
        );

        HttpResponse<String> response = executeRequest(request);

        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    public void verifyFailStatusCode(){

        HttpRequest request = getRequest(
                "https://www.postman-echo.com/get",
                HttpMethod.POST,
                HttpRequest.BodyPublishers.noBody()
        );

        HttpResponse<String> response = executeRequest(request);

        Assertions.assertEquals(404, response.statusCode());
    }
}


