#!/usr/bin/env bash

docker run --rm --name node-build-server-temp -v "$(pwd)":/webapp -w /webapp  szopen/node:10-build \
  npm install --save-dev node-sass && npm install && npm run dev
