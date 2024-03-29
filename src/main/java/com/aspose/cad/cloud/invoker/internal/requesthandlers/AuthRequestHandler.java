/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="OAuthRequestHandler.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd.
* </copyright>
* <summary>
*   Permission is hereby granted, free of charge, to any person obtaining a copy
*  of this software and associated documentation files (the "Software"), to deal
*  in the Software without restriction, including without limitation the rights
*  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*  copies of the Software, and to permit persons to whom the Software is
*  furnished to do so, subject to the following conditions:
* 
*  The above copyright notice and this permission notice shall be included in all
*  copies or substantial portions of the Software.
* 
*  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*  SOFTWARE.
* </summary>
* --------------------------------------------------------------------------------------------------------------------
*/

package com.aspose.cad.cloud.invoker.internal.requesthandlers;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import com.aspose.cad.cloud.invoker.Configuration;
import com.aspose.cad.cloud.invoker.internal.ApiInvoker;
import com.aspose.cad.cloud.invoker.internal.SerializationHelper;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auth request handler.
 */
public class AuthRequestHandler implements IRequestHandler
{
    /**
     * The configuration
     */
    private final Configuration configuration;

    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;

    /**
     * The access token
     */
    private String accessToken;

    /**
     * Initializes a new instance of the OAuthRequestHandler class.
     * @param configuration The configuration.
     */
    public AuthRequestHandler(Configuration configuration)
    {
        this.configuration = configuration;

        IRequestHandler[] requestHandlers = new IRequestHandler[2];
        requestHandlers[0] = new DebugLogRequestHandler(this.configuration);
        requestHandlers[1] = new ApiExceptionRequestHandler();
        this.apiInvoker = new ApiInvoker(requestHandlers, this.configuration);
    }

    /**
     * Processes the URL.
     * @param url The URL.
     * @return Processed URL.
     */
    public String processUrl(String url)
    {
        return url;
    }

    /**
     * Processes parameters before sending.
     * @param connection The connection.
     * @param streamToSend The stream to send.
     * @throws Exception 
     */
    public void beforeSend(HttpURLConnection connection, OutputStream streamToSend) throws Exception
    {
        if (this.accessToken == null || this.accessToken == "")
        {
            this.requestJwtToken();
        }
        
        connection.setRequestProperty("Authorization", "Bearer " + this.accessToken);
    }

    /**
     * Processes the response.
     * @param connection The connection.
     * @param resultData The result data.
     * @throws IOException 
     * @throws Exception 
     */
    public void processResponse(HttpURLConnection connection, byte[] resultData) throws IOException, Exception
    {
    }

    /**
     * Requests the JWT token.
     * @throws Exception
     */
    private void requestJwtToken() throws Exception
    {
        String requestUrl = this.configuration.getApiBaseUrl() + "connect/token";

        String postData = "grant_type=client_credentials";
        postData += "&client_id=" + this.configuration.ClientId;
        postData += "&client_secret=" + this.configuration.ClientSecret;

        this.requestToken(requestUrl, postData);
    }
    
    /**
     * Requests the token.
     * @param tokenUrl Token URL.
     * @param postData Post data.
     * @throws Exception
     */
    private void requestToken(String tokenUrl, String postData) throws Exception
    {
        byte[] resultData = this.apiInvoker.invokeApi(
                tokenUrl,
                "POST",
                postData,
                null,
                null,
                "application/x-www-form-urlencoded");
        String responseString = new String(resultData);

        GetAccessTokenResult result =
            SerializationHelper.deserialize(responseString, GetAccessTokenResult.class);

        this.accessToken = result.AccessToken;
    }

    /**
     * Token access result class.
     */
    public static class GetAccessTokenResult
    {
        public GetAccessTokenResult()
        {
            
        }
        
        @JsonProperty("access_token")
        public String AccessToken;
        
        @JsonProperty("expires_in")
        public String ExpiresIn;
        
        @JsonProperty("token_type")
        public String TokenType;
    }        
}