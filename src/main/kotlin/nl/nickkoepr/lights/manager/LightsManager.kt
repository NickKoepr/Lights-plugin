package nl.nickkoepr.lights.manager

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

object LightsManager {

    //API key
    private val key = "PASTE_YOUR_API_KEY_HERE"

    fun setLights(mode: LightMode, response: (String) -> Unit) {
        //Make a request to the website.
        val client = HttpClient.newBuilder().build()
        val request = HttpRequest.newBuilder(
            URI.create("https://maker.ifttt.com/trigger/${mode.name.lowercase()}/with/key/$key")
        )
            .build()

        //Return the respone from the website.
        response(client.send(request, HttpResponse.BodyHandlers.ofString()).body())
    }
}