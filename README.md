# cuba-sample-web-component

This project demonstrates customizing of a standard CUBA UI component: `PickerField`. The [customized implementation](https://github.com/knstvk/cuba-sample-web-component/blob/master/modules/web/src/com/company/sample/web/components/MyWebPickerField.java) configures `LookupAction` in such a way that all lookup screens are opened in `OpenType.DIALOG` mode.

The new component class is registered in [web-ui-components.xml](https://github.com/knstvk/cuba-sample-web-component/blob/master/modules/web/src/com/company/sample/web-ui-components.xml) file which is in turn registered in the `cuba.web.componentsConfig` property in [web-app.properties](https://github.com/knstvk/cuba-sample-web-component/blob/master/modules/web/src/com/company/sample/web-app.properties).
