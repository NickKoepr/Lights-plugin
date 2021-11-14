# lights-plugin
A plugin that can turn your lights on or off with IFTTT.

# How it works
If you execute the command `/lights on` or the command `/lights off`, the plugin will send a request to IFTTT. 
If you want to use this plugin, you have to create two apples on IFTTT. Select by `If This` a webhook, and call them `on` and `off`. 
Then add your lamp by `Then That`, and turn it on or off.
Paste your api-key in the `LightsManager` class, and compile the plugin with `gradle shadowJar`. 
