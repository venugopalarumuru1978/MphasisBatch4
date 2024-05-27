import { CanActivateFn, Router } from '@angular/router';
import { LoginService } from './login.service';
import { inject } from '@angular/core';

const loginService = new LoginService();

export const loginGuard: CanActivateFn = (route, state) => {
  let router = inject(Router);
  let usercheck = loginService.checkUserExistInSession();
  if(usercheck==false)
  {
    alert("Please Login First");
    router.navigate(['/login']);
  }
  return usercheck;
};
