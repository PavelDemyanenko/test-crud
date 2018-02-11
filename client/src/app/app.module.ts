import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { UserService } from './shared/user/user.service';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';


@NgModule({
  declarations: [
    AppComponent,
    UserListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
