package com.clouddeadline.JoobyQRCode;

import io.jooby.JoobyTest;
import io.jooby.StatusCode;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@JoobyTest(App.class)
public class IntegrationTest {

  static OkHttpClient client = new OkHttpClient();

  /**
   * Integration test example using OKHttpClient. The serverPort(int) argument is generated by
   * Jooby. Jooby automatically set it as long it is declared as int and name it: serverPort.
   *
   * Please refer to: https://jooby.io/#testing-integration-testing for more information.
   *
   * @param serverPort Server port (must be compiled with --parameters enabled).
   * @throws IOException If something goes wrong.
   */
//  @Test
//  public void shouldSayWelcome(int serverPort) throws IOException {
//    Request req = new Request.Builder()
//        .url("http://localhost:" + serverPort)
//        .build();
//
//    try (Response rsp = client.newCall(req).execute()) {
//      assertEquals("Welcome to Jooby!", rsp.body().string());
//      assertEquals(StatusCode.OK.value(), rsp.code());
//    }
//  }
}
