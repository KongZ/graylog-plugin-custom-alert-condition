# Overview
A Graylog's alert plugin what allow you to trigger the alert when found messages match to a defined query string.

For example, you want to know that are no logs are sent from source in last 3 minutes. You may use query `source:myhost` and period `PT3M` with threshold `1`.

Condition Example:

![unmatched_condition](https://github.com/omise/graylog-plugin-custom-alert-condition/blob/master/unmatched_condition.png)

If not `source:myhost` found in logs on last 3 minutes, it will trigger an alert.

Another sample, trigger alert when we found a message which level is 4 more than 5 times in last 15 minutes

Condition Example:

![matched_condition](https://github.com/omise/graylog-plugin-custom-alert-condition/blob/master/matched_condition.png)

Alert screenshot:

![alert](https://github.com/omise/graylog-plugin-custom-alert-condition/blob/master/alert_screenshot.png)

The period can be configured using [ISO8601](https://en.wikipedia.org/wiki/ISO_8601#Durations) period format.