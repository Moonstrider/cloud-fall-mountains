import {Head, Html, Main, NextScript} from "next/document";
import {BrowserRouter} from "react-router-dom";

export default function Document() {
  return (
      <BrowserRouter>
        <Html lang="en">
          <Head/>
          <body className="antialiased">
          <Main/>
          <NextScript/>
          </body>
        </Html>
      </BrowserRouter>
  );
}
