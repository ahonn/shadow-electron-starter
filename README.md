# shadow-electron-starter
ClojureScript + Shadow-cljs + Electron + Reagent

## How to Run
```
npm install electron-prebuilt -g
npm install shadow-cljs -g
npm install

npm run dev
electron .
```

## Release
```
npm run build
electron-packager . HelloWorld --platform=darwin --arch=x64 --version=1.4.13
```
