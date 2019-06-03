void renderBanner() {}

    final bool indexmac = (platform.toUpperCase().indexOf("MAC") > -1);
    final bool indexie = (browser.toUpperCase().indexOf("IE") > -1);
  if (indexmac && indexie && wasInitialized() && resize > 0)
  {
    // do something
  }
}