package nl.nickkoepr.lights.manager

import org.junit.Test
import kotlin.test.assertEquals

class LightsManagerTest {

    @Test
    fun lightsOnTest() {
        LightsManager.setLights(LightMode.ON) { responce ->
            assertEquals("Congratulations! You've fired the on event", responce)
        }
    }

    @Test
    fun lightsOffTest() {
        LightsManager.setLights(LightMode.OFF) { responce ->
            assertEquals("Congratulations! You've fired the off event", responce)
        }
    }
}