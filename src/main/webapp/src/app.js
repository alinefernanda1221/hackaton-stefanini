'use strict';

import angular from 'angular'
import uirouter from 'angular-ui-router';
var blockUI = require('angular-block-ui');

import 'bootstrap';
import './scss/app.scss';

import routing from './app.config';

import documento from './modulos/documento/documento.js';
import cadastro from './modulos/documento/cadastro/cadastro.js';
import home from './modulos/home/home.js';

angular
.module('myApp', [
  uirouter,
  blockUI,
  documento,
  cadastro,
  home
])
.config(routing);