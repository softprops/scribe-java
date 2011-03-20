package org.scribe.builder.api;

import org.scribe.model.Token;

/**
 * OAuth 1.0a interface for http://meetup.com/api
 * @author Doug Tangren
 */
public class MeetupApi extends DefaultApi10a
{
	private static final String AUTHORIZATION_URL = "http://www.meetup.com/authorize/?oauth_token=%s";
	
	@Override
	public String getAccessTokenEndpoint()
	{
		return "https://api.meetup.com/oauth/access/";
	}

	@Override
	public String getRequestTokenEndpoint()
	{
		return "https://api.meetup.com/oauth/request/";
	}
	  
	@Override
	public String getAuthorizationUrl(Token requestToken)
	{
		return String.format(AUTHORIZATION_URL, requestToken.getToken());
	}
}