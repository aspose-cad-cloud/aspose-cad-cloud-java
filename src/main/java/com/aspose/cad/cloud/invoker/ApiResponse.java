/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ApiResponse.java">
*   Copyright (c) 2018 Aspose.CAD for Cloud
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
package com.aspose.cad.cloud.invoker;

import com.aspose.cad.cloud.CadResponse;
import com.aspose.cad.cloud.SaaSposeResponse;

/**
 * Represents CAD for Cloud response.
 * @author User
 *
 */
public class ApiResponse
{
	private byte[] responseData;

	private SaaSposeResponse saasposeResponse;

	private CadResponse cadResponse;

	/**
	 *
	 * @param responseData The response data that represents image bytes in most cases (if present).
	 * @param saasposeResponse Old API format response (if present).
	 * @param cadResponse Regular API format response (if present).
	 */
	public ApiResponse(byte[] responseData, SaaSposeResponse saasposeResponse, CadResponse cadResponse)
	{
		this.responseData = responseData;
		this.saasposeResponse = saasposeResponse;
		this.cadResponse = cadResponse;
	}

	public byte[] getResponseData()
	{
		return this.responseData;
	}

	public SaaSposeResponse getSaaSposeResponse()
	{
		return this.saasposeResponse;
	}

	public CadResponse getCadResponse()
	{
		return this.cadResponse;
	}
}
